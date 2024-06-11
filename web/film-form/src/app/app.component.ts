import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  film = {
    title: '',
    category: ''
  };

  onSubmit(){
    console.log({tytul: this.film.title, kategoria: this.film.category})
  }
}