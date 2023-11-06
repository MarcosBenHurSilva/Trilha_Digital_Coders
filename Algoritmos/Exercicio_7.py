class ContaBancaria:
    def __init__(self):
        self.saldo = 0.00

    def get_saldo(self):
        return self.saldo

    def depositar(self, valor):
        if valor > 0:
            self.saldo += valor
            print(f"Depósito de {self.formatar_valor(valor)} efetuado.")
        else:
            print("Valor de depósito inválido. Digite um valor positivo.")

    def sacar(self, valor):
        if valor > 0 and valor <= self.saldo:
            self.saldo -= valor
            print(f"Saque de {self.formatar_valor(valor)} efetuado.")
        else:
            print("Saque não permitido, saldo insuficiente.")

    def formatar_valor(self, valor):
        return "{:.2f}".format(valor)

if __name__ == "__main__":
    conta = ContaBancaria()

    while True:
        print("Escolha uma opção:")
        print("1. Ver saldo")
        print("2. Depositar")
        print("3. Sacar")
        print("4. Sair")

        opcao = input("Opção: ")

        if opcao == "1":
            print(f"Saldo é: {conta.get_saldo()}")
        elif opcao == "2":
            valor_deposito = float(input("Digite o valor a depositar: "))
            conta.depositar(valor_deposito)
        elif opcao == "3":
            valor_saque = float(input("Digite o valor a retirar: "))
            conta.sacar(valor_saque)
        elif opcao == "4":
            print("Encerrando o programa.")
            break
        else:
            print("Opção inválida. Por favor, escolha uma opção válida.")
