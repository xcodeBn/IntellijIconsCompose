package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Variable: ImageVector
    get() {
        if (_Variable != null) return _Variable!!

        _Variable = ImageVector.Builder(
            name = "Variable",
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
                moveTo(2f, 6f)
                lineTo(-0f, 0f)
                lineTo(1f, 0f)
                curveTo(2.39f, 3.14f, 2.99f, 4.74f, 3.00f, 4.80f)
                lineTo(5f, 0f)
                lineTo(6f, 0f)
                lineTo(4f, 6f)
                lineTo(2f, 6f)
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
                    moveTo(2f, 6f)
                    lineTo(-0f, 0f)
                    lineTo(1f, 0f)
                    curveTo(2.39f, 3.14f, 2.99f, 4.74f, 3.00f, 4.80f)
                    lineTo(5f, 0f)
                    lineTo(6f, 0f)
                    lineTo(4f, 6f)
                    lineTo(2f, 6f)
                    close()
                }
            }
        }.build()

        return _Variable!!
    }

private var _Variable: ImageVector? = null

