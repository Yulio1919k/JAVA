from moviepy.editor import VideoFileClip
def main():
    try:
        peso = float(input("Ingrese el peso en Kg: "))
    except ValueError:
        print("Por favor, ingrese un número válido.")
        return
    if peso <= 80:
        print("Estás bien de peso.")
        return
    video_path = r'C:\Users\Julio-Vanega\Desktop\DON JAVA\Aguas\Oye gelda.mp4'
    try:
        clip = VideoFileClip(video_path)
    except OSError as e:
        print(f"No se pudo cargar el video: {e}")
        return
    clip.preview(fps=60)
    clip.close()
if __name__ == '__main__':
    main()
