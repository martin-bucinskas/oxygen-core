CREATE SCHEMA IF NOT EXISTS oxygen_core;

CREATE TABLE IF NOT EXISTS oxygen_core.accounts(
    account_id INT NOT NULL,
    provider_account_id varchar(50) NOT NULL,
    provider_id varchar(25) NOT NULL,
    account_type varchar(10) NOT NULL,
    account_name varchar(100) NOT NULL,
    CONSTRAINT unique_account_id UNIQUE(account_id)
);