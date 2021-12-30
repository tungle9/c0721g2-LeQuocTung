import {Component, OnInit} from '@angular/core';
import {EmployeeService} from '../../service/employee-service';
import {Employee} from '../../model/employee';
import {Subscription} from 'rxjs';
import {ActivatedRoute, ParamMap} from '@angular/router';

@Component({
  selector: 'app-employee-detail',
  templateUrl: './employee-detail.component.html',
  styleUrls: ['./employee-detail.component.css']
})
export class EmployeeDetailComponent implements OnInit {
  public employee: Employee;
  private subscription: Subscription;
  id: any;


  constructor(private employeeService: EmployeeService,
              private activatedRoute: ActivatedRoute,
  ) {

  }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      console.log(this.id);
    });
    this.subscription = this.employeeService.getEmployeeById(this.id).subscribe(
      data => {
        this.employee = data;
      }, error => {
        console.log('error');
      }
    );
  }
}

