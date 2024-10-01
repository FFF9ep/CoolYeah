import { test } from 'node:test';
import assert from 'node:assert';
import sum from './index.js';

test('sum with positive numbers', () => {
  const result = sum(2, 3);
  assert.strictEqual(result, 5); // 2 + 3 = 5
});

test('sum with zero', () => {
  const result = sum(0, 0);
  assert.strictEqual(result, 0); // 0 + 0 = 0
});

test('sum with negative numbers', () => {
  const result = sum(-1, -1);
  assert.strictEqual(result, 0); // -1 + -1 = 0 (returns 0 because negative numbers are invalid)
});

test('sum with positive and negative number', () => {
  const result = sum(5, -3);
  assert.strictEqual(result, 0); // 5 + -3 = 0 (returns 0 because negative numbers are invalid)
});

test('sum with non-numeric values', () => {
  const result1 = sum('a', 3);
  const result2 = sum(3, 'b');
  const result3 = sum('a', 'b');
  assert.strictEqual(result1, 0); // non-numeric value should return 0
  assert.strictEqual(result2, 0); // non-numeric value should return 0
  assert.strictEqual(result3, 0); // non-numeric value should return 0
});

test('sum with undefined values', () => {
  const result1 = sum(undefined, 5);
  const result2 = sum(5, undefined);
  assert.strictEqual(result1, 0); // undefined should return 0
  assert.strictEqual(result2, 0); // undefined should return 0
});

test('sum with null values', () => {
  const result1 = sum(null, 3);
  const result2 = sum(3, null);
  assert.strictEqual(result1, 0); // null should return 0
  assert.strictEqual(result2, 0); // null should return 0
});

test('sum with only one argument', () => {
  const result1 = sum(5);
  assert.strictEqual(result1, 0); // missing one argument, should return 0
});

test('sum with large numbers', () => {
  const result = sum(1000000, 2000000);
  assert.strictEqual(result, 3000000); // 1000000 + 2000000 = 3000000
});
