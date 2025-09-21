package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Addany: ImageVector
    get() {
        if (_Addany != null) return _Addany!!

        _Addany = ImageVector.Builder(
            name = "Addany",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(10f, 14f)
                lineTo(10f, 15f)
                lineTo(3f, 15f)
                lineTo(3f, 6f)
                lineTo(8f, 6f)
                lineTo(8f, 1f)
                lineTo(13f, 1f)
                lineTo(13f, 7f)
                lineTo(10f, 7f)
                lineTo(10f, 10f)
                lineTo(7f, 10f)
                lineTo(7f, 14f)
                lineTo(10f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(13f, 11f)
                lineTo(16f, 11f)
                lineTo(16f, 13f)
                lineTo(13f, 13f)
                lineTo(13f, 16f)
                lineTo(11f, 16f)
                lineTo(11f, 13f)
                lineTo(8f, 13f)
                lineTo(8f, 11f)
                lineTo(11f, 11f)
                lineTo(11f, 8f)
                lineTo(13f, 8f)
                lineTo(13f, 11f)
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
                    moveTo(10f, 14f)
                    lineTo(10f, 15f)
                    lineTo(3f, 15f)
                    lineTo(3f, 6f)
                    lineTo(8f, 6f)
                    lineTo(8f, 1f)
                    lineTo(13f, 1f)
                    lineTo(13f, 7f)
                    lineTo(10f, 7f)
                    lineTo(10f, 10f)
                    lineTo(7f, 10f)
                    lineTo(7f, 14f)
                    lineTo(10f, 14f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(13f, 11f)
                    lineTo(16f, 11f)
                    lineTo(16f, 13f)
                    lineTo(13f, 13f)
                    lineTo(13f, 16f)
                    lineTo(11f, 16f)
                    lineTo(11f, 13f)
                    lineTo(8f, 13f)
                    lineTo(8f, 11f)
                    lineTo(11f, 11f)
                    lineTo(11f, 8f)
                    lineTo(13f, 8f)
                    lineTo(13f, 11f)
                    close()
                }
            }
        }.build()

        return _Addany!!
    }

private var _Addany: ImageVector? = null

