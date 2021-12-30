import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DictinonaryComponent } from './dictinonary.component';

describe('DictinonaryComponent', () => {
  let component: DictinonaryComponent;
  let fixture: ComponentFixture<DictinonaryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DictinonaryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DictinonaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
