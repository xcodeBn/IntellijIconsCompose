package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Shelve: ImageVector
    get() {
        if (_Shelve != null) return _Shelve!!

        _Shelve = ImageVector.Builder(
            name = "Shelve",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(3f, 10f)
                lineTo(3f, 13f)
                lineTo(13f, 13f)
                lineTo(13f, 10f)
                lineTo(15f, 10f)
                lineTo(15f, 15f)
                lineTo(1f, 15f)
                lineTo(1f, 10f)
                lineTo(3f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF389FD6))
            ) {
                moveTo(9f, 7f)
                lineTo(12f, 7f)
                lineTo(8f, 11f)
                lineTo(4f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 4f)
                lineTo(9f, 4f)
                lineTo(9f, 7f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(3f, 10f)
                    lineTo(3f, 13f)
                    lineTo(13f, 13f)
                    lineTo(13f, 10f)
                    lineTo(15f, 10f)
                    lineTo(15f, 15f)
                    lineTo(1f, 15f)
                    lineTo(1f, 10f)
                    lineTo(3f, 10f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF389FD6))
                ) {
                    moveTo(9f, 7f)
                    lineTo(12f, 7f)
                    lineTo(8f, 11f)
                    lineTo(4f, 7f)
                    lineTo(7f, 7f)
                    lineTo(7f, 4f)
                    lineTo(9f, 4f)
                    lineTo(9f, 7f)
                    close()
                }
            }
        }.build()

        return _Shelve!!
    }

private var _Shelve: ImageVector? = null

