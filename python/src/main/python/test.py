from BaseUser import *
from Approve import *
from Edit import *
from Delete import *
from Publish import *

user = BaseUser()
#user = Approve(user)
user = Edit(user)
user = Delete(user)
user = Publish(user)

print(user.getPrivileges())
print(user.approve())
print(user.delete())
print(user.edit())
print(user.publish())

