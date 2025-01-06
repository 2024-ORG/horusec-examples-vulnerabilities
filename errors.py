import hashlib

username = input("Username: ")
password = input("Password: ")

# Insecure: Storing passwords directly
hashed_password = hashlib.md5(password.encode()).hexdigest() 

# ... (store hashed_password in a database or file)
