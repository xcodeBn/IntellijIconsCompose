package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cwmkick: ImageVector
    get() {
        if (_Cwmkick != null) return _Cwmkick!!

        _Cwmkick = ImageVector.Builder(
            name = "Cwmkick",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 9f)
                lineTo(8f, 9f)
                lineTo(8f, 10f)
                lineTo(7f, 11f)
                lineTo(7f, 9f)
                lineTo(6f, 9f)
                lineTo(6f, 13f)
                lineTo(9f, 10f)
                lineTo(9f, 9f)
                close()
                moveTo(6f, 14f)
                lineTo(11f, 14f)
                lineTo(11f, 13f)
                lineTo(7f, 13f)
                lineTo(6f, 14f)
                close()
                moveTo(6f, 4f)
                lineTo(6f, 2f)
                lineTo(9f, 2f)
                lineTo(9f, 4f)
                lineTo(8f, 4f)
                lineTo(8f, 3f)
                lineTo(7f, 3f)
                lineTo(7f, 4f)
                lineTo(6f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDB5860))
            ) {
                moveTo(12f, 4f)
                lineTo(11f, 3f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(9f, 9f)
                    lineTo(8f, 9f)
                    lineTo(8f, 10f)
                    lineTo(7f, 11f)
                    lineTo(7f, 9f)
                    lineTo(6f, 9f)
                    lineTo(6f, 13f)
                    lineTo(9f, 10f)
                    lineTo(9f, 9f)
                    close()
                    moveTo(6f, 14f)
                    lineTo(11f, 14f)
                    lineTo(11f, 13f)
                    lineTo(7f, 13f)
                    lineTo(6f, 14f)
                    close()
                    moveTo(6f, 4f)
                    lineTo(6f, 2f)
                    lineTo(9f, 2f)
                    lineTo(9f, 4f)
                    lineTo(8f, 4f)
                    lineTo(8f, 3f)
                    lineTo(7f, 3f)
                    lineTo(7f, 4f)
                    lineTo(6f, 4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFDB5860))
                ) {
                    moveTo(12f, 4f)
                    lineTo(11f, 3f)
                    close()
                }
            }
        }.build()

        return _Cwmkick!!
    }

private var _Cwmkick: ImageVector? = null

