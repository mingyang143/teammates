import { Component, EventEmitter, Output } from "@angular/core";

@Component({
  selector: "tm-dark-mode-button",
  templateUrl: "./dark-mode-button.component.html",
  styleUrls: ["./dark-mode-button.component.scss"],
})
export class DarkModeButtonComponent {
  @Output() darkModeToggled = new EventEmitter<boolean>();
  constructor() {}
  isDarkMode: boolean = JSON.parse(
    localStorage.getItem("isDarkMode") || "false"
  );
  toggleDarkMode() {
    this.isDarkMode = !this.isDarkMode;
    console.log("Dark mode is now", this.isDarkMode ? "enabled" : "disabled");
    localStorage.setItem("isDarkMode", JSON.stringify(this.isDarkMode));
    this.darkModeToggled.emit(this.isDarkMode);
  }
}
