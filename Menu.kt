fun main() {
    val tasks = mutableListOf<String>()
    
    while (true) {
        println("Selecione uma opção:")
        println("1. Adicionar tarefa")
        println("2. Marcar tarefa como concluída")
        println("3. Listar tarefas")
        println("4. Sair")

        val choice = readLine()

        when (choice) {
            "1" -> {
                println("Digite a tarefa a ser adicionada:")
                val task = readLine()
                
                if (task != null) {
                    tasks.add(task)
                    println("Tarefa adicionada:" + task)
                }
            }
            "2" -> {
                if (tasks.isEmpty()) {
                    println("Nenhuma tarefa para marcar como concluída.")
                } else {
                    println("Tarefas disponíveis:")
                    for ((index, task) in tasks.withIndex()) {
                        println("$index." + task)
                    }
                    println("Digite o número da tarefa que deseja marcar como concluída:")
                    val taskIndex = readLine()?.toIntOrNull()
                    if (taskIndex != null && taskIndex >= 0 && taskIndex < tasks.size) {
                        val task = tasks[taskIndex]
                        tasks.removeAt(taskIndex)
                        println("Tarefa marcada como concluída:" + task)
                    } else {
                        println("Opção inválida.")
                    }
                }
            }
            "3" -> {
                if (tasks.isEmpty()) {
                    println("Nenhuma tarefa disponível.")
                } else {
                    println("Tarefas disponíveis:")
                    for ((index, task) in tasks.withIndex()) {
                        println("$index." + task)
                    }
                }
            }
            "4" -> {
                println("Saindo do programa.")
                return
            }
            else -> {
                println("Opção inválida. Escolha uma opção de 1 a 4.")
            }
        }
    }
}
