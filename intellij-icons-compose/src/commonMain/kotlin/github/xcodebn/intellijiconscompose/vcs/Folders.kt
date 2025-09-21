package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Folders: ImageVector
    get() {
        if (_Folders != null) return _Folders!!

        _Folders = ImageVector.Builder(
            name = "Folders",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(8f, 7f)
                lineTo(12f, 7f)
                lineTo(12f, 13f)
                lineTo(2f, 13f)
                lineTo(2f, 7f)
                lineTo(2f, 5f)
                lineTo(7f, 5f)
                lineTo(8f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(13f, 11f)
                lineTo(13f, 6f)
                lineTo(9f, 6f)
                lineTo(8f, 4f)
                lineTo(4f, 4f)
                lineTo(4f, 2f)
                lineTo(9f, 2f)
                lineTo(10f, 4f)
                lineTo(14f, 4f)
                lineTo(14f, 11f)
                lineTo(13f, 11f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(8f, 7f)
                    lineTo(12f, 7f)
                    lineTo(12f, 13f)
                    lineTo(2f, 13f)
                    lineTo(2f, 7f)
                    lineTo(2f, 5f)
                    lineTo(7f, 5f)
                    lineTo(8f, 7f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(13f, 11f)
                    lineTo(13f, 6f)
                    lineTo(9f, 6f)
                    lineTo(8f, 4f)
                    lineTo(4f, 4f)
                    lineTo(4f, 2f)
                    lineTo(9f, 2f)
                    lineTo(10f, 4f)
                    lineTo(14f, 4f)
                    lineTo(14f, 11f)
                    lineTo(13f, 11f)
                    close()
                }
            }
        }.build()

        return _Folders!!
    }

private var _Folders: ImageVector? = null

