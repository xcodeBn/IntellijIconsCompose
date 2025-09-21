package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cancel: ImageVector
    get() {
        if (_Cancel != null) return _Cancel!!

        _Cancel = ImageVector.Builder(
            name = "Cancel",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 9f)
                lineTo(4f, 13f)
                lineTo(3f, 12f)
                lineTo(7f, 8f)
                lineTo(3f, 4f)
                lineTo(4f, 3f)
                lineTo(8f, 7f)
                lineTo(12f, 3f)
                lineTo(13f, 4f)
                lineTo(9f, 8f)
                lineTo(13f, 12f)
                lineTo(12f, 13f)
                lineTo(8f, 9f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 9f)
                    lineTo(4f, 13f)
                    lineTo(3f, 12f)
                    lineTo(7f, 8f)
                    lineTo(3f, 4f)
                    lineTo(4f, 3f)
                    lineTo(8f, 7f)
                    lineTo(12f, 3f)
                    lineTo(13f, 4f)
                    lineTo(9f, 8f)
                    lineTo(13f, 12f)
                    lineTo(12f, 13f)
                    lineTo(8f, 9f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 9f)
                    lineTo(4f, 13f)
                    lineTo(3f, 12f)
                    lineTo(7f, 8f)
                    lineTo(3f, 4f)
                    lineTo(4f, 3f)
                    lineTo(8f, 7f)
                    lineTo(12f, 3f)
                    lineTo(13f, 4f)
                    lineTo(9f, 8f)
                    lineTo(13f, 12f)
                    lineTo(12f, 13f)
                    lineTo(8f, 9f)
                    close()
                }
            }
        }.build()

        return _Cancel!!
    }

private var _Cancel: ImageVector? = null

