'use strict';
// Jutka got ill. Hável the school director is looking for somebody who can teach instead of Jutka.
// Bela bacsi has free time at 8 o'clock, Bujaki at 9 o'clock, Vilma at 10 o'clock.
// The program should print the schedule of the teachers.

function getDeputy(hour) {
  let isIll = true;
  let deputy;

  while (isIll) {
    if (hour === 8) {
      deputy = 'Bela bacsi';
      isIll = false;
    }
    else if (hour === 9) {
      deputy = 'Bujaki';
      isIll = false;
    }
    else if (hour === 10) {
      deputy = 'Vilma';
      isIll = false;
    }
  }
  return deputy;
}

console.log("At eight:", getDeputy(8));
console.log("At nine:", getDeputy(9));
console.log("At ten:", getDeputy(10));
