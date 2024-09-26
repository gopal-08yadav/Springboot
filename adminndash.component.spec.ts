import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminndashComponent } from './adminndash.component';

describe('AdminndashComponent', () => {
  let component: AdminndashComponent;
  let fixture: ComponentFixture<AdminndashComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AdminndashComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminndashComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
