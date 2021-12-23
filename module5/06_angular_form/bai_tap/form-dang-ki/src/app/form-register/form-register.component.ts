import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, FormGroupDirective, Validators} from '@angular/forms';


@Component({
  selector: 'app-form-register',
  templateUrl: './form-register.component.html',
  styleUrls: ['./form-register.component.css']
})
export class FormRegisterComponent implements OnInit {
  // registers: Register = {email: '', password: 0, country : '', age : 0, gender : 1};

  register: FormGroup;

  constructor() {
  }

  ngOnInit(): void {
    // @ts-ignore
    // @ts-ignore
    this.register = new FormGroup({
      txtEmail: new FormControl('', [Validators.minLength(6), Validators.required]),
      txtPassword: new FormControl('', [Validators.required, Validators.minLength(6)]),
      txtCountry: new FormControl(),
      txtAge: new FormControl(),
      txtGender: new FormControl(),
      txtPhoneNumber: new FormControl(),
    });
  }


  clickSubmit(formElement: FormGroupDirective) {
    if (formElement.valid) {
      alert('bạn đã tạo thành công.. f12 để xem');
      console.log(this.register.value);

    }
  }
}

// <!--email?: string;-->
// <!--password?: number|string;-->
// <!--country?: string;-->
// <!--age?: number;-->
// <!--gender?: number;-->
