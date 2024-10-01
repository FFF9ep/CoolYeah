import { test } from 'node:test';
import { strict as assert } from 'node:assert';
import { calculateSum } from './index.js';

test('Testing calculateSum function', (t) => {
  // Test case 1: Regular addition
  assert.equal(calculateSum(2, 3), 5);

  // Test case 2: Summing negative numbers
  assert.equal(calculateSum(-1, -1), -2);

  // Test case 3: Summing zeros
  assert.equal(calculateSum(0, 0), 0);

  // Test case 4: Adding positive and negative numbers
  assert.equal(calculateSum(5, -3), 2);
});
