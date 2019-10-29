
class User():
    
    def __init__(self):
        self.privilegios = "No hay privilegios"

    def priviledges(self) -> str:
        pass

    def aprovingpriviledges(self) -> str:
        pass

    def comentingpriviledges(self) -> str:
        pass

    def deletingpriviledges(self) -> str:
        pass

    def publishpriviledges(self) -> str:
        pass

class SinPriviledges(User):

    def priviledges(self) -> str:
        return "No tienes privilegios"

    def aprovingpriviledges(self) -> str:
        return "No tienes privilegios de aprobar"

    def comentingpriviledges(self) -> str:
        return "No tienes privilegios de comentar"

    def deletingpriviledges(self) -> str:
        return "No tienes privilegios de borrar"

    def publishpriviledges(self) -> str:
        return "No tienes privilegios de publicar"

class Privilegios(User):

    _user : User

    def __init__(self, user: User):
        self._user = user

    @property
    def user(self) -> str:
        return self._user

    def priviledges(self) -> str:
        self._user.priviledges()

    def aprovingpriviledges(self) -> str:
        self._user.aprovingpriviledges()

    def comentingpriviledges(self) -> str:
        self._user.comentingpriviledges()

    def deletingpriviledges(self) -> str:
        self._user.deletingpriviledges()

    def publishpriviledges(self) -> str:
        self._user.publishpriviledges()

class Approving(Privilegios):

    def priviledges(self) -> str:
        return f"Ya tienes algun privilegio"

    def aprovingpriviledges(self) -> str:
        return f"ya tienes el privilegio de aprobar"

    def comentingpriviledges(self) -> str:
        return self._user.comentingpriviledges()

    def deletingpriviledges(self) -> str:
        return self._user.deletingpriviledges()

    def publishpriviledges(self) -> str:
        return self._user.publishpriviledges()

class Comenting(Privilegios):

    def priviledges(self) -> str:
        return f"Ya tienes algun privilegio"

    def aprovingpriviledges(self) -> str:
        return  self._user.aprovingpriviledges()

    def comentingpriviledges(self) -> str:
        return f"ya tienes el privilegio de comentar"

    def deletingpriviledges(self) -> str:
        return self._user.deletingpriviledges()

    def publishpriviledges(self) -> str:
        return self._user.publishpriviledges()

class Deleting(Privilegios):

    def priviledges(self) -> str:
        return f"Ya tienes algun privilegio"

    def aprovingpriviledges(self) -> str:
        return self._user.aprovingpriviledges()

    def comentingpriviledges(self) -> str:
        return self._user.comentingpriviledges()

    def deletingpriviledges(self) -> str:
        return f"ya tienes el privilegio de borrar"

    def publishpriviledges(self) -> str:
        return self._user.publishpriviledges()

class Publish(Privilegios):

    def priviledges(self) -> str:
        return f"Ya tienes algun privilegio"

    def aprovingpriviledges(self) -> str:
        return self._user.aprovingpriviledges()

    def comentingpriviledges(self) -> str:
        return self._user.comentingpriviledges()

    def deletingpriviledges(self) -> str:
        return self._user.deletingpriviledges()

    def publishpriviledges(self) -> str:
        return f"ya tienes el privilegio de publicar"

def mostrar(user:User) -> None:
    print(f"privilegios: {user.priviledges()} \naprobar: {user.aprovingpriviledges()} \ncomentar: {user.comentingpriviledges()} \nborrar: {user.deletingpriviledges()} \npublicar: {user.publishpriviledges()} \n ", end="")


if __name__=="__main__":
    print("======= Inicio ==============")
    print("======= Admin Sin privilegios ==============")
    admin = SinPriviledges()
    print("\n")
    mostrar(admin)
    print("\n")
    print("======= Admin Aprobar ==============")
    admin = Approving(admin)
    mostrar(admin)
    print("\n")
    print("======= Admin Comentar ==============")
    admin = Comenting(admin)
    mostrar(admin)
    print("\n")
    print("======= Admin borrar ==============")
    admin = Deleting(admin)
    mostrar(admin)
    print("\n")
    print("======= Admin Publicar ==============")
    admin = Publish(admin)
    mostrar(admin)
    

