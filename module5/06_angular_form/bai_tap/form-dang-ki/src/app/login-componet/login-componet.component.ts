import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, FormGroupDirective, Validators} from '@angular/forms';


@Component({
  selector: 'app-login-componet',
  templateUrl: './login-componet.component.html',
  styleUrls: ['./login-componet.component.css']
})
export class LoginComponetComponent implements OnInit {
  loginForm: FormGroup;

  constructor(private loginForms: FormBuilder) {
  }

  ngOnInit(): void {
    this.loginForm = this.loginForms.group({
      userEmail: ['', [Validators.required]],
      passwordValid: ['', [Validators.minLength(6)]]
    });
  }

  // onSubmit(loginValid: NgForm) {
  //   if (loginValid.valid) {
  //     alert('bạn đã đăng nhập thành công ' + this.loginForm.value.userEmail);
  //   }
  // }
  onSubmit(loginValid: FormGroupDirective) {
    if (loginValid.valid) {
      alert('bạn đã đăng nhập thành công');
    }
  }
}
