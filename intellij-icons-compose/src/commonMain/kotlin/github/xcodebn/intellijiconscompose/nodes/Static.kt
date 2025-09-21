package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Static: ImageVector
    get() {
        if (_Static != null) return _Static!!

        _Static = ImageVector.Builder(
            name = "Static",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF4AF3D))
            ) {
                moveTo(15f, 8f)
                curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(3f, 6f)
                curveTo(2.26f, 6.00f, 1.42f, 5.69f, 0.72f, 5.07f)
                lineTo(1f, 4f)
                curveTo(1.90f, 4.82f, 2.46f, 5.09f, 3.18f, 5.09f)
                curveTo(3.81f, 5.09f, 4.21f, 4.79f, 4.21f, 4.36f)
                lineTo(4f, 4f)
                curveTo(4.21f, 3.92f, 3.98f, 3.70f, 2.90f, 3.45f)
                curveTo(1.65f, 3.15f, 0.95f, 2.78f, 0.95f, 1.71f)
                lineTo(1f, 2f)
                curveTo(0.95f, 0.69f, 1.79f, 0.00f, 2.94f, 0.00f)
                curveTo(3.79f, 0.00f, 4.47f, 0.26f, 5.06f, 0.73f)
                lineTo(5f, 2f)
                curveTo(3.99f, 1.12f, 3.46f, 0.91f, 2.93f, 0.91f)
                curveTo(2.33f, 0.91f, 1.98f, 1.22f, 1.98f, 1.60f)
                lineTo(2f, 2f)
                curveTo(1.98f, 2.07f, 2.25f, 2.27f, 3.37f, 2.53f)
                curveTo(4.60f, 2.83f, 5.24f, 3.27f, 5.24f, 4.24f)
                lineTo(5f, 4f)
                curveTo(5.24f, 5.35f, 4.38f, 6.00f, 3.15f, 6.00f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFF4AF3D))
                ) {
                    moveTo(15f, 8f)
                    curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                    curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                    curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                    curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
                }
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(3f, 6f)
                    curveTo(2.26f, 6.00f, 1.42f, 5.69f, 0.72f, 5.07f)
                    lineTo(1f, 4f)
                    curveTo(1.90f, 4.82f, 2.46f, 5.09f, 3.18f, 5.09f)
                    curveTo(3.81f, 5.09f, 4.21f, 4.79f, 4.21f, 4.36f)
                    lineTo(4f, 4f)
                    curveTo(4.21f, 3.92f, 3.98f, 3.70f, 2.90f, 3.45f)
                    curveTo(1.65f, 3.15f, 0.95f, 2.78f, 0.95f, 1.71f)
                    lineTo(1f, 2f)
                    curveTo(0.95f, 0.69f, 1.79f, 0.00f, 2.94f, 0.00f)
                    curveTo(3.79f, 0.00f, 4.47f, 0.26f, 5.06f, 0.73f)
                    lineTo(5f, 2f)
                    curveTo(3.99f, 1.12f, 3.46f, 0.91f, 2.93f, 0.91f)
                    curveTo(2.33f, 0.91f, 1.98f, 1.22f, 1.98f, 1.60f)
                    lineTo(2f, 2f)
                    curveTo(1.98f, 2.07f, 2.25f, 2.27f, 3.37f, 2.53f)
                    curveTo(4.60f, 2.83f, 5.24f, 3.27f, 5.24f, 4.24f)
                    lineTo(5f, 4f)
                    curveTo(5.24f, 5.35f, 4.38f, 6.00f, 3.15f, 6.00f)
                    close()
                }
            }
        }.build()

        return _Static!!
    }

private var _Static: ImageVector? = null

