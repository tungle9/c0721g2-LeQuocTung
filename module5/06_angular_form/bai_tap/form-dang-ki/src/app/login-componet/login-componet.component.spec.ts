import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginComponetComponent } from './login-componet.component';

describe('LoginComponetComponent', () => {
  let component: LoginComponetComponent;
  let fixture: ComponentFixture<LoginComponetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoginComponetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginComponetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
