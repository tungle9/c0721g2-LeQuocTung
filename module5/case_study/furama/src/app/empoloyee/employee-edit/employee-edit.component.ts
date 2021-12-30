import {Component, OnInit} from '@angular/core';
import {EmployeeService} from '../../service/employee-service';
import {Employee} from '../../model/employee';
import {User} from '../../model/user';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Subscription} from 'rxjs';
import {UserService} from '../../service/user.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {
  employee: Employee[] = [];
  user: User[] = [];
  editEmployee: FormGroup;
  private subscription: Subscription;
  private id: number;

  constructor(private employeeService: EmployeeService,
              private userService: UserService,
              private router: Router,
              public activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.editEmployee = new FormGroup({
      name: new FormControl('', [Validators.required]),
      email: new FormControl('', [Validators.required, Validators.email]),
      position: new FormControl('', [Validators.required]),
      degree: new FormControl('', [Validators.required]),
      phoneNumber: new FormControl('', [Validators.required, Validators.minLength(6)]),
      address: new FormControl('', [Validators.required]),
      // , Validators.pattern('[d][n]')]
      dateOfBirth: new FormControl('', [Validators.required]),
      employeeUser: new FormControl()
    });
    // this.subscription = this.userService.getAllUser().subscribe(
    //   data => {
    //     this.user = data;
    //   }, error => {
    //     console.log('error');
    //   }
    // );
    //  --lấy id bằng param--
    // this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
    //   this.id = +paramMap.get('id');
    //   console.log(this.id);
    // });
    this.activatedRoute.params.subscribe(data => {
      this.id = data.id;
      console.log(this.id);
    });
    this.subscription = this.employeeService.getEmployeeById(this.id).subscribe(
      data => {
        // this.editEmployee = data;
        this.editEmployee.patchValue(data);
        console.log(data);
      }, error => {
        console.log('error');
      }
    );
    this.subscription = this.userService.getAllUser().subscribe(
      data => {
        this.user = data;
      }, error => {
        console.log('error');
      }
    );
  }

  deleteEmployee(id: number) {
    this.employeeService.deleteEmployee(id);
  }

  // submit() {
  //   if (this.editEmployee.valid){
  //     this.employeeService.saveEmployee(this.editEmployee.value).subscribe(
  //       data => {
  //         this.router.navigateByUrl('employee/list');
  //       }
  //     );
  //   }
  // }

  edit() {
    console.log(this.editEmployee.value);
    this.employeeService.editEmployee(this.editEmployee.value, this.id).subscribe(
      data => {
        this.router.navigateByUrl('employee/list');
      }
    );
  }
}
