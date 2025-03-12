INSERT INTO ingredient_test.ingredient (id, name, producer, kcal, protein, fat, saturated_fat, dietary_fiber, carbohydrates) VALUES
    ('1604a446-0392-4a38-a389-10e99abba386', 'Apple', 'None', 66, 2, 1, 0, 30, 61),
    ('2604a446-0392-4a38-a389-10e99abba386', 'Pear', 'None', 45, 2, 1, 0, 20, 51);

INSERT INTO ingredient_test.recipe (id, name, instructions, comments) VALUES
    ('9dddde58-120d-45f6-8214-4353c69bb89b', 'Fruit salad', 'None', 'None');

INSERT INTO ingredient_test.recipe_ingredients (recipe_id, ingredients_id) VALUES
    ('9dddde58-120d-45f6-8214-4353c69bb89b','1604a446-0392-4a38-a389-10e99abba386'),
    ('9dddde58-120d-45f6-8214-4353c69bb89b','2604a446-0392-4a38-a389-10e99abba386');
