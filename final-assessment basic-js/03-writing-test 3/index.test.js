import { test } from 'node:test';
import assert from 'node:assert';
import { sum } from './index.js';

test('sum of two positive numbers', () => {
  assert.strictEqual(sum(2, 3), 5); // 2 + 3 = 5
});

test('sum of a positive and a negative number', () => {
  assert.strictEqual(sum(5, -2), 3); // 5 + (-2) = 3
});

test('sum of two negative numbers', () => {
  assert.strictEqual(sum(-4, -5), -9); // -4 + (-5) = -9
});

test('sum of zero and a number', () => {
  assert.strictEqual(sum(0, 7), 7); // 0 + 7 = 7
});

test('sum of two zeros', () => {
  assert.strictEqual(sum(0, 0), 0); // 0 + 0 = 0
});
