import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  createCustomer: FormGroup = new FormGroup({});


  constructor(private test: FormBuilder) {
    this.createCustomer = test.group({
      password: ['', [Validators.required]],
      confirmPassword: ['', [Validators.required]]
    }, {
      validator: this.checkPassword('password', 'confirmPassword')
    });
  }


  ngOnInit() {
    // this.createCustomer = new FormGroup({
    //     password: new FormControl('', [Validators.required, Validators.minLength(7)]),
    //     confirmPassword: new FormControl('')
    //   }, { validator: this.checkPasswrod('password', 'confirmPassword') }
    //   );
  }

  submit() {
    if (this.createCustomer.valid) {
      alert('đã đăng nhập thành công');
    }
  }

   checkPassword(controlName: any, matchingControlName: any) {
    return (formGroup: FormGroup) => {
      const control = formGroup.controls[controlName];
      const matchingControl = formGroup.controls[matchingControlName];
      if (matchingControl.errors && !matchingControl.errors.checkPassword) {
        return;
      }
      if (control.value !== matchingControl.value) {
        matchingControl.setErrors({checkPassword: true});
      } else {
        matchingControl.setErrors(null);
      }
    };
  }
}
