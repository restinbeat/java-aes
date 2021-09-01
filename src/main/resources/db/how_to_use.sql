# How to use AES-256-CBC for MySQL

SET block_encryption_mode = 'aes-256-cbc';

update tm_manage.tm_card
set
    card_number_temp = TO_BASE64(AES_ENCRYPT(card_number,unhex(hex(key_length(32))) , unhex(hex(key_length(16)))));
