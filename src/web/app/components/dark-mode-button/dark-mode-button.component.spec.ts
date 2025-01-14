import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DarkModeButtonComponent } from './dark-mode-button.component';

describe('DarkModeButtonComponent', () => {
  let component: DarkModeButtonComponent;
  let fixture: ComponentFixture<DarkModeButtonComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DarkModeButtonComponent]
    });
    fixture = TestBed.createComponent(DarkModeButtonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
