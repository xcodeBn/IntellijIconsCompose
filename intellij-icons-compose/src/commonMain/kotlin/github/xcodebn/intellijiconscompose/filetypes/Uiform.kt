package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Uiform: ImageVector
    get() {
        if (_Uiform != null) return _Uiform!!

        _Uiform = ImageVector.Builder(
            name = "Uiform",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(5f, 9f)
                lineTo(11f, 9f)
                lineTo(11f, 7f)
                lineTo(5f, 7f)
                lineTo(5f, 9f)
                close()
                moveTo(5f, 13f)
                lineTo(11f, 13f)
                lineTo(11f, 10f)
                lineTo(5f, 10f)
                lineTo(5f, 13f)
                close()
                moveTo(8f, 1f)
                lineTo(8f, 6f)
                lineTo(3f, 6f)
                lineTo(3f, 15f)
                lineTo(13f, 15f)
                lineTo(13f, 1f)
                lineTo(8f, 1f)
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
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(5f, 9f)
                    lineTo(11f, 9f)
                    lineTo(11f, 7f)
                    lineTo(5f, 7f)
                    lineTo(5f, 9f)
                    close()
                    moveTo(5f, 13f)
                    lineTo(11f, 13f)
                    lineTo(11f, 10f)
                    lineTo(5f, 10f)
                    lineTo(5f, 13f)
                    close()
                    moveTo(8f, 1f)
                    lineTo(8f, 6f)
                    lineTo(3f, 6f)
                    lineTo(3f, 15f)
                    lineTo(13f, 15f)
                    lineTo(13f, 1f)
                    lineTo(8f, 1f)
                    close()
                }
            }
        }.build()

        return _Uiform!!
    }

private var _Uiform: ImageVector? = null

