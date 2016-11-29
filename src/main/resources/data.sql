insert into ShoppingList.lists (user_id, name, color, created_utc, modified_utc) values (1, 'John', 'Blue','2016-11-29', '2016-12-1');

insert into ShoppingList.items (shopping_list_id, contents, priority, is_checked, created_utc, modified_utc) values (1, 'A lovely item', 'It can wait', TRUE, '2016-11-29', '2016-12-1');

insert into ShoppingList.notes (shopping_list_item_id, body, created_utc, modified_utc) values (1, 'Hey, this is the note body.', '2016-11-29', '2016-12-1');