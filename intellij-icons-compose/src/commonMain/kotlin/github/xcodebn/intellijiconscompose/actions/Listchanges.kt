package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Listchanges: ImageVector
    get() {
        if (_Listchanges != null) return _Listchanges!!

        _Listchanges = ImageVector.Builder(
            name = "Listchanges",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 4f)
                lineTo(13f, 4f)
                lineTo(8f, 9f)
                lineTo(4f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 1f)
                lineTo(9f, 1f)
                lineTo(9f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 8f)
                lineTo(8f, 8f)
                lineTo(4f, 13f)
                lineTo(-1f, 8f)
                lineTo(3f, 8f)
                lineTo(3f, 5f)
                lineTo(5f, 5f)
                lineTo(5f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(9f, 4f)
                    lineTo(13f, 4f)
                    lineTo(8f, 9f)
                    lineTo(4f, 4f)
                    lineTo(7f, 4f)
                    lineTo(7f, 1f)
                    lineTo(9f, 1f)
                    lineTo(9f, 4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(5f, 8f)
                    lineTo(8f, 8f)
                    lineTo(4f, 13f)
                    lineTo(-1f, 8f)
                    lineTo(3f, 8f)
                    lineTo(3f, 5f)
                    lineTo(5f, 5f)
                    lineTo(5f, 8f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(9f, 4f)
                    lineTo(13f, 4f)
                    lineTo(8f, 9f)
                    lineTo(4f, 4f)
                    lineTo(7f, 4f)
                    lineTo(7f, 1f)
                    lineTo(9f, 1f)
                    lineTo(9f, 4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(5f, 8f)
                    lineTo(8f, 8f)
                    lineTo(4f, 13f)
                    lineTo(-1f, 8f)
                    lineTo(3f, 8f)
                    lineTo(3f, 5f)
                    lineTo(5f, 5f)
                    lineTo(5f, 8f)
                    close()
                }
            }
        }.build()

        return _Listchanges!!
    }

private var _Listchanges: ImageVector? = null

