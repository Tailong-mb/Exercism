export function reverse(phrase:string):string {
  return phrase.split("")
              .reverse()
              .join("")
}
