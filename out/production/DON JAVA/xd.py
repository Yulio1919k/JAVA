import networkx as nx
import matplotlib.pyplot as plt

# Crear un grafo dirigido
torneo = nx.DiGraph()

# Agregar nodos (equipos)
equipos = ["Tigers", "Blue Jays", "Cardinals", "Orioles"]
torneo.add_nodes_from(equipos)

# Agregar aristas (resultados del torneo)
resultados = [
    ("Tigers", "Blue Jays"),
    ("Tigers", "Cardinals"),
    ("Tigers", "Orioles"),
    ("Blue Jays", "Cardinals"),
    ("Blue Jays", "Orioles"),
    ("Cardinals", "Orioles"),
]

torneo.add_edges_from(resultados)

# Dibujar el grafo
plt.figure(figsize=(8, 6))
pos = nx.circular_layout(torneo)  # Disposición circular
nx.draw(torneo, pos, with_labels=True, node_size=3000, node_color="lightblue", font_size=10, font_weight="bold", arrowsize=20)
plt.title("Torneo de todos contra todos")
plt.show()
