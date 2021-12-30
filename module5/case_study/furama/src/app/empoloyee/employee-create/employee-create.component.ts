import {Component, OnInit} from '@angular/core';
import {Employee} from '../../model/employee';
import {EmployeeService} from '../../service/employee-service';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {User} from '../../model/user';
import {UserService} from '../../service/user.service';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {
  // employee: Employee[] = [];
  user: User[] = [];
  createEmployee: FormGroup;
  private subscription: Subscription;

  constructor(private employeeService: EmployeeService,
              private userService: UserService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.createEmployee = new FormGroup({
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
    this.subscription = this.userService.getAllUser().subscribe(
      data => {
        this.user = data;
        // console.log(data);
      }, error => {
        console.log('error');
      }
    );
  }

  submit() {
    if (this.createEmployee.valid) {
      this.employeeService.saveEmployee(this.createEmployee.value).subscribe(
        data => {
          // alert('đã tạo thành công');
          this.router.navigateByUrl('employee/list');
          alert('bạn đã tạo thành công');
        }
      );
    }
  }
}
