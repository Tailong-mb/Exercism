export function decodedValue(colorArray: Array<string>) {
    const colorAry = [
        'black',
        'brown',
        'red',
        'orange',
        'yellow',
        'green',
        'blue',
        'violet',
        'grey',
        'white',
    ];
  const firstNumber: number = colorAry.indexOf(colorArray[0], 0);
  const secondNumber: number = colorAry.indexOf(colorArray[1], 0);
  return (firstNumber*10+secondNumber);
};