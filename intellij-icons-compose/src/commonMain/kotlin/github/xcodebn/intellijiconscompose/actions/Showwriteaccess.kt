package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Showwriteaccess: ImageVector
    get() {
        if (_Showwriteaccess != null) return _Showwriteaccess!!

        _Showwriteaccess = ImageVector.Builder(
            name = "Showwriteaccess",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFDB5860))
            ) {
                moveTo(7f, 11f)
                lineTo(8f, 10f)
                lineTo(9f, 12f)
                lineTo(12f, 8f)
                lineTo(9f, 4f)
                lineTo(8f, 6f)
                lineTo(7f, 5f)
                lineTo(10f, 2f)
                lineTo(15f, 8f)
                lineTo(10f, 14f)
                lineTo(7f, 11f)
                close()
                moveTo(5f, 9f)
                lineTo(4f, 8f)
                lineTo(5f, 7f)
                lineTo(4f, 8f)
                lineTo(5f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(6f, 8f)
                lineTo(8f, 8f)
                lineTo(5f, 12f)
                lineTo(1f, 8f)
                lineTo(4f, 8f)
                lineTo(4f, 4f)
                lineTo(6f, 4f)
                lineTo(6f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFDB5860))
                ) {
                    moveTo(7f, 11f)
                    lineTo(8f, 10f)
                    lineTo(9f, 12f)
                    lineTo(12f, 8f)
                    lineTo(9f, 4f)
                    lineTo(8f, 6f)
                    lineTo(7f, 5f)
                    lineTo(10f, 2f)
                    lineTo(15f, 8f)
                    lineTo(10f, 14f)
                    lineTo(7f, 11f)
                    close()
                    moveTo(5f, 9f)
                    lineTo(4f, 8f)
                    lineTo(5f, 7f)
                    lineTo(4f, 8f)
                    lineTo(5f, 9f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(6f, 8f)
                    lineTo(8f, 8f)
                    lineTo(5f, 12f)
                    lineTo(1f, 8f)
                    lineTo(4f, 8f)
                    lineTo(4f, 4f)
                    lineTo(6f, 4f)
                    lineTo(6f, 8f)
                    close()
                }
            }
        }.build()

        return _Showwriteaccess!!
    }

private var _Showwriteaccess: ImageVector? = null

