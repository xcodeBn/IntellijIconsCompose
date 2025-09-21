package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Parameter: ImageVector
    get() {
        if (_Parameter != null) return _Parameter!!

        _Parameter = ImageVector.Builder(
            name = "Parameter",
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
                moveTo(1f, 3f)
                curveTo(1.00f, 3.84f, 1.24f, 4.88f, 2.54f, 4.88f)
                curveTo(3.83f, 4.88f, 4.00f, 3.46f, 4.00f, 2.79f)
                curveTo(4.00f, 2.11f, 3.90f, 0.75f, 2.52f, 0.75f)
                curveTo(1.15f, 0.75f, 1.00f, 1.77f, 1.00f, 2.80f)
                close()
                moveTo(1f, 5f)
                curveTo(1.01f, 5.07f, 1.01f, 6.07f, 1.00f, 8.00f)
                lineTo(0f, 8f)
                lineTo(0f, 0f)
                lineTo(1f, 0f)
                lineTo(1f, 1f)
                curveTo(1.37f, 0.25f, 1.94f, 0.00f, 2.72f, 0.00f)
                curveTo(3.88f, 0.00f, 5.00f, 0.58f, 5.00f, 2.80f)
                curveTo(5.00f, 5.03f, 3.65f, 5.62f, 2.72f, 5.62f)
                curveTo(2.09f, 5.62f, 1.52f, 5.42f, 1.00f, 5.00f)
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
                    moveTo(1f, 3f)
                    curveTo(1.00f, 3.84f, 1.24f, 4.88f, 2.54f, 4.88f)
                    curveTo(3.83f, 4.88f, 4.00f, 3.46f, 4.00f, 2.79f)
                    curveTo(4.00f, 2.11f, 3.90f, 0.75f, 2.52f, 0.75f)
                    curveTo(1.15f, 0.75f, 1.00f, 1.77f, 1.00f, 2.80f)
                    close()
                    moveTo(1f, 5f)
                    curveTo(1.01f, 5.07f, 1.01f, 6.07f, 1.00f, 8.00f)
                    lineTo(0f, 8f)
                    lineTo(0f, 0f)
                    lineTo(1f, 0f)
                    lineTo(1f, 1f)
                    curveTo(1.37f, 0.25f, 1.94f, 0.00f, 2.72f, 0.00f)
                    curveTo(3.88f, 0.00f, 5.00f, 0.58f, 5.00f, 2.80f)
                    curveTo(5.00f, 5.03f, 3.65f, 5.62f, 2.72f, 5.62f)
                    curveTo(2.09f, 5.62f, 1.52f, 5.42f, 1.00f, 5.00f)
                    close()
                }
            }
        }.build()

        return _Parameter!!
    }

private var _Parameter: ImageVector? = null

