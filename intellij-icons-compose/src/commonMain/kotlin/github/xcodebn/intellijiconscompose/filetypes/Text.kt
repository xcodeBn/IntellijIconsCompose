package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Text: ImageVector
    get() {
        if (_Text != null) return _Text!!

        _Text = ImageVector.Builder(
            name = "Text",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(5f, 12f)
                lineTo(9f, 12f)
                lineTo(9f, 11f)
                lineTo(5f, 11f)
                lineTo(5f, 12f)
                close()
                moveTo(5f, 10f)
                lineTo(11f, 10f)
                lineTo(11f, 9f)
                lineTo(5f, 9f)
                lineTo(5f, 10f)
                close()
                moveTo(5f, 8f)
                lineTo(11f, 8f)
                lineTo(11f, 7f)
                lineTo(5f, 7f)
                lineTo(5f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(7f, 1f)
                lineTo(3f, 5f)
                lineTo(7f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(8f, 1f)
                lineTo(8f, 6f)
                lineTo(3f, 6f)
                lineTo(3f, 15f)
                lineTo(13f, 15f)
                lineTo(13f, 1f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(5f, 12f)
                    lineTo(9f, 12f)
                    lineTo(9f, 11f)
                    lineTo(5f, 11f)
                    lineTo(5f, 12f)
                    close()
                    moveTo(5f, 10f)
                    lineTo(11f, 10f)
                    lineTo(11f, 9f)
                    lineTo(5f, 9f)
                    lineTo(5f, 10f)
                    close()
                    moveTo(5f, 8f)
                    lineTo(11f, 8f)
                    lineTo(11f, 7f)
                    lineTo(5f, 7f)
                    lineTo(5f, 8f)
                    close()
                }
            }
        }.build()

        return _Text!!
    }

private var _Text: ImageVector? = null

