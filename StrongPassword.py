import secrets

pwd_length: int = int(input("Enter the length of the password: "))

while pwd_length < 8 or pwd_length > 16:
    print("Password length should be between 8 and 16")
    pwd_length = int(input("Enter the length of the password: "))

# generate password
password: str = ""
while len(password) < pwd_length:
    password += secrets.choice("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()")
print(f"\nAuto generated password: {password}\n")


"""
def generate_password(pwd_length):
    password = ""
    while len(password) < pwd_length:
        password += chr(secrets.randbelow(94) + 33)
    return password
"""

"""
# if pwdlen is not integer, repeat the input
pwdlen = int(input("Enter the length of the password: "))

if not isinstance(pwdlen, int):
    while not isinstance(pwdlen, int):
        pwdlen = int(input("Enter the length of the password: "))
else:  # if pwdlen is integer, generate the password
    print(generatePassword(pwdlen))
"""

"""_Using random module_
import random

def generatePassword():
  password = ""
  while len(password) < 16:
    password += chr(random.randint(33, 126))
  return password
"""

"""
password += secrets.choice(random.randint(0, 1) and "abcdefghijklmnopqrstuvwxyz01234567890" or 
"ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+")

password += chr(random.randint(33, 126)) password += secrets.choice(random.choice([chr(random.randint(33, 47)),
chr(random.randint(58, 64)), chr(random.randint(91, 96)), chr(random.randint(123, 126))]))

"""