package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Showreadaccess: ImageVector
    get() {
        if (_Showreadaccess != null) return _Showreadaccess!!

        _Showreadaccess = ImageVector.Builder(
            name = "Showreadaccess",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(6f, 10f)
                lineTo(8f, 10f)
                lineTo(9f, 12f)
                lineTo(12f, 8f)
                lineTo(9f, 4f)
                lineTo(8f, 6f)
                lineTo(6f, 6f)
                lineTo(10f, 2f)
                lineTo(15f, 8f)
                lineTo(10f, 14f)
                lineTo(6f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(5f, 8f)
                lineTo(8f, 8f)
                lineTo(4f, 12f)
                lineTo(1f, 8f)
                lineTo(3f, 8f)
                lineTo(3f, 4f)
                lineTo(5f, 4f)
                lineTo(5f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF59A869))
                ) {
                    moveTo(6f, 10f)
                    lineTo(8f, 10f)
                    lineTo(9f, 12f)
                    lineTo(12f, 8f)
                    lineTo(9f, 4f)
                    lineTo(8f, 6f)
                    lineTo(6f, 6f)
                    lineTo(10f, 2f)
                    lineTo(15f, 8f)
                    lineTo(10f, 14f)
                    lineTo(6f, 10f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(5f, 8f)
                    lineTo(8f, 8f)
                    lineTo(4f, 12f)
                    lineTo(1f, 8f)
                    lineTo(3f, 8f)
                    lineTo(3f, 4f)
                    lineTo(5f, 4f)
                    lineTo(5f, 8f)
                    close()
                }
            }
        }.build()

        return _Showreadaccess!!
    }

private var _Showreadaccess: ImageVector? = null

