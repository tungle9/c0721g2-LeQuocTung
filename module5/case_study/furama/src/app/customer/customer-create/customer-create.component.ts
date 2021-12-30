import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {Customer} from '../../model/customer';
import {TypeCustomer} from '../../model/type-customer';
import {CustomerService} from '../../service/customer.service';
import {TypeCustomerService} from '../../service/type-customer.service';
import {Router} from '@angular/router';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  createCustomer: FormGroup;
  customer: Customer[] = [];
  customerType: TypeCustomer[] = [];
  private subscription: Subscription;


  constructor(private customerService: CustomerService,
              private typeCustomerService: TypeCustomerService,
              private router: Router) {
  }

  // id?: number;
  // name?: string;
  // address?: string;
  // phoneNumber?: number;
  // age?: number;
  // gender?: string;
  // type?: any;
  ngOnInit(): void {
    this.createCustomer = new FormGroup({
      name: new FormControl(),
      address: new FormControl(),
      phoneNumber: new FormControl(),
      age: new FormControl(),
      gender: new FormControl(),
      type: new FormControl()
    });
    this.typeCustomerService.getAllType().subscribe(
      data => {
        this.customerType = data;
        console.log(data);
      },
      error => {
        console.log('error');
      }
    );
  }

  submit() {
    this.customerService.saveCustomer(this.createCustomer.value).subscribe(
      data => {
        this.router.navigateByUrl('customer/list');
      }
    );
  }
}
