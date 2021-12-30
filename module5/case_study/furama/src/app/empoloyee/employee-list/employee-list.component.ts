import {Component, OnInit} from '@angular/core';
import {Employee} from '../../model/employee';
import {EmployeeService} from '../../service/employee-service';
import {Subscription} from 'rxjs';
import {UserService} from '../../service/user.service';
import {User} from '../../model/user';
import {Router} from '@angular/router';


@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employee: Employee[] | undefined;
  user: User[] | undefined;
  private subscription: Subscription;
  term: any;
  p: any;


  constructor(private employeeService: EmployeeService,
              private userService: UserService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.subscription = this.employeeService.getAllEmployee().subscribe(
      data => {
        this.employee = data;
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

  delete(employee: Employee) {
    this.employeeService.deleteEmployee(employee.id).subscribe(
      data => {
        this.employee = data;
        this.ngOnInit();
        // this.router.navigateByUrl('employee/list');
      }, error => {
        console.log('error');
      }
    );
  }
  // showDetail(i: any) {
  //   this.employeeService.detail(i);
  // }
}
