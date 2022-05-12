export const isPangram = (sentence :string): boolean => {
  return [..."abcdefghijklmnopqrstuvwxyz"].every(c => sentence.toLowerCase().includes(c))
};

