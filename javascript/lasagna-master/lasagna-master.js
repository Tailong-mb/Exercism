/// <reference path="./global.d.ts" />
// @ts-check

/**
 * Implement the functions needed to solve the exercise here.
 * Do not forget to export them so they are available for the
 * tests. Here an example of the syntax as reminder:
 *
 * export function yourFunction(...) {
 *   ...
 * }
 */

export function cookingStatus(timeRemaining) {
  if(timeRemaining === undefined)
    return 'You forgot to set the timer.'
  if(timeRemaining === 0)
    return 'Lasagna is done.'
  else
    return 'Not done, please wait.'
}

export function preparationTime(layerArray, timePerLayer){
  if(timePerLayer === undefined)
    return layerArray.length * 2
  else
    return layerArray.length * timePerLayer
}

export function quantities(layerArray) {
  const NOODLES_PER_LAYER = 50;
  const SAUCE_PER_LAYER = 0.2;
  let noodleLayers = 0;
  let sauceLayers = 0;
  for(let layer of layerArray){
    if (layer === 'noodles')
      noodleLayers += 1;
    if (layer === 'sauce')
      sauceLayers += 1;
  }
  return { 'noodles': noodleLayers * NOODLES_PER_LAYER, 'sauce': sauceLayers * SAUCE_PER_LAYER };
}

export function addSecretIngredient(listIngredients, ingredients) {
    ingredients.push(listIngredients[listIngredients.length - 1]);
}

export function scaleRecipe(recipe, amount){
  let result = {...recipe};
for(let i in result){
  result[i] = recipe[i] * (amount/2);
}
return result
}