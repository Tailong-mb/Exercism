// @ts-check

/**
 * Calculates the sum of the two input arrays.
 *
 * @param {number[]} array1
 * @param {number[]} array2
 * @returns {number} sum of the two arrays
 */
export function twoSum(array1, array2) {
  let stringArray1 = "";
  for (let number of array1) {
    stringArray1 += String(number);
  }
  let stringArray2 = "";
  for (let number of array2) {
    stringArray2 += String(number);
  }
  return Number(stringArray1) + Number(stringArray2);
}

/**
 * Checks whether a number is a palindrome.
 *
 * @param {number} value
 * @returns {boolean}  whether the number is a palindrome or not
 */
export function luckyNumber(value) {
  return String(value).split("").reverse().join("") === String(value);
}

/**
 * Determines the error message that should be shown to the user
 * for the given input value.
 *
 * @param {string|null|undefined} input
 * @returns {string} error message
 */
export function errorMessage(input) {
  if (!input) return "Required field";
  if (!Number(input) || Number(input) === 0)
    return "Must be a number besides 0";
  return "";
}
