package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Editscheme: ImageVector
    get() {
        if (_Editscheme != null) return _Editscheme!!

        _Editscheme = ImageVector.Builder(
            name = "Editscheme",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 5f)
                lineTo(6f, 2f)
                lineTo(0f, 9f)
                lineTo(0f, 11f)
                lineTo(2f, 11f)
                lineTo(9f, 5f)
                close()
                moveTo(11f, 3f)
                curveTo(10.91f, 2.63f, 10.91f, 1.92f, 10.65f, 1.65f)
                lineTo(9f, 0f)
                curveTo(9.13f, 0.13f, 8.42f, 0.13f, 8.15f, 0.40f)
                lineTo(7f, 2f)
                lineTo(9f, 4f)
                lineTo(11f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 4f)
                lineTo(0f, 2f)
                lineTo(4f, 0f)
                lineTo(4f, 1f)
                lineTo(1f, 3f)
                lineTo(4f, 5f)
                lineTo(4f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 5f)
                lineTo(3f, 3f)
                lineTo(0f, 1f)
                lineTo(0f, 0f)
                lineTo(4f, 2f)
                lineTo(4f, 4f)
                lineTo(0f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(9f, 5f)
                    lineTo(6f, 2f)
                    lineTo(0f, 9f)
                    lineTo(0f, 11f)
                    lineTo(2f, 11f)
                    lineTo(9f, 5f)
                    close()
                    moveTo(11f, 3f)
                    curveTo(10.91f, 2.63f, 10.91f, 1.92f, 10.65f, 1.65f)
                    lineTo(9f, 0f)
                    curveTo(9.13f, 0.13f, 8.42f, 0.13f, 8.15f, 0.40f)
                    lineTo(7f, 2f)
                    lineTo(9f, 4f)
                    lineTo(11f, 3f)
                    close()
                }
            }
        }.build()

        return _Editscheme!!
    }

private var _Editscheme: ImageVector? = null

