class Animal:
    def __init__(self, nome, som, classe):
        self.nome = nome
        self.som = som
        self.classe = classe

    def caracteristica(self):
        print(f"Quais são as caracteristica do {self.nome}?.")
        pass


class Passaro(Animal):
    def __init__(self, nome, som, locomocao):
        super().__init__(nome, som, "Ave")
        self.locomocao = locomocao

    def caracteristica(self):
        print(
            f'O {self.nome} faz o som "{self.som}", ele é {self.locomocao} e {self.classe}.\n'
        )


class Mamifero(Animal):
    def __init__(self, nome, som, locomocao):
        super().__init__(nome, som, "Mamífero")
        self.locomocao = locomocao

    def caracteristica(self):
        print(
            f'O {self.nome} faz o som "{self.som}", ele é {self.locomocao} e {self.classe}.\n'
        )


cachorro = Mamifero("Cachorro", "Au au au", "Terrestre")
cachorro.caracteristica()

vaca = Mamifero("Vaca", "Muuuuu", "Terrestre")
vaca.caracteristica()

bem_te_vi = Passaro("Bem Te Vi", "Beeeem teee viiii", "Voador")
bem_te_vi.caracteristica()

papagaio = Passaro("Papagaio", "Repetição de palavras", "Voador")
papagaio.caracteristica()
