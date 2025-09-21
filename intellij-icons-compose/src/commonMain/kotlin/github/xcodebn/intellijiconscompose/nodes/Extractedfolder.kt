package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Extractedfolder: ImageVector
    get() {
        if (_Extractedfolder != null) return _Extractedfolder!!

        _Extractedfolder = ImageVector.Builder(
            name = "Extractedfolder",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(12f, 11f)
                lineTo(7f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 4f)
                lineTo(8f, 4f)
                lineTo(7f, 3f)
                curveTo(6.30f, 2.32f, 5.53f, 2.00f, 4.98f, 2.00f)
                lineTo(1f, 2f)
                curveTo(1.02f, 2.00f, 1.00f, 2.02f, 1.00f, 2.05f)
                lineTo(1f, 13f)
                lineTo(15f, 13f)
                lineTo(15f, 8f)
                lineTo(12f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(14f, 6f)
                lineTo(15f, 6f)
                lineTo(15f, 4f)
                lineTo(14f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(9f, 7f)
                lineTo(12f, 10f)
                lineTo(15f, 7f)
                lineTo(13f, 7f)
                lineTo(13f, 2f)
                lineTo(11f, 2f)
                lineTo(11f, 7f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(12f, 11f)
                    lineTo(7f, 6f)
                    lineTo(10f, 6f)
                    lineTo(10f, 4f)
                    lineTo(8f, 4f)
                    lineTo(7f, 3f)
                    curveTo(6.30f, 2.32f, 5.53f, 2.00f, 4.98f, 2.00f)
                    lineTo(1f, 2f)
                    curveTo(1.02f, 2.00f, 1.00f, 2.02f, 1.00f, 2.05f)
                    lineTo(1f, 13f)
                    lineTo(15f, 13f)
                    lineTo(15f, 8f)
                    lineTo(12f, 11f)
                    close()
                }
            }
        }.build()

        return _Extractedfolder!!
    }

private var _Extractedfolder: ImageVector? = null

