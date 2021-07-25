import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-word',
  templateUrl: './word.component.html',
  styleUrls: ['./word.component.css']
})
export class WordComponent implements OnInit {
  newEn = '';
  newVn = '';
  isShowForm = false;
  filterStatus = 'XEM_TAT_CA';
  arrWords = [
    {id: 1, en: 'action', vn: 'hành động', memorized: true},
    {id: 2, en: 'actor', vn: 'diễn viên', memorized: false},
    {id: 3, en: 'activity', vn: 'hoạt động', memorized: true},
    {id: 4, en: 'active', vn: 'chủ động', memorized: true},
    {id: 5, en: 'bath', vn: 'tắm', memorized: false},
    {id: 6, en: 'bedroom', vn: 'phòng ngủ', memorized: true}
  ];

  constructor() {
  }

  ngOnInit(): void {
  }

  addWord() {
    this.arrWords.unshift({
      id: this.arrWords.length + 1,
      en: this.newEn,
      vn: this.newVn,
      memorized: false
    });
    this.newVn = '';
    this.newEn = '';
    this.isShowForm = false;
  }

  remove(id: number) {
    const index = this.arrWords.findIndex(word => word.id === id);
    this.arrWords.splice(index, 1);
  }

  getShowStatus(memorized: boolean) {
    const dkTatCa = this.filterStatus === 'XEM_TAT_CA';
    const dkChuaNho = this.filterStatus === 'XEM_DA_NHO' && memorized;
    const dkDaNho = this.filterStatus === 'XEM_CHUA_NHO' && !memorized;
    return dkChuaNho || dkDaNho || dkTatCa;
  }

}
