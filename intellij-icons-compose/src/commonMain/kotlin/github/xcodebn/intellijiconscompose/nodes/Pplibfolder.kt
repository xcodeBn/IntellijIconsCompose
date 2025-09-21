package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pplibfolder: ImageVector
    get() {
        if (_Pplibfolder != null) return _Pplibfolder!!

        _Pplibfolder = ImageVector.Builder(
            name = "Pplibfolder",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(15f, 7f)
                lineTo(14f, 7f)
                lineTo(14f, 5f)
                lineTo(10f, 5f)
                lineTo(10f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 13f)
                lineTo(1f, 13f)
                lineTo(1f, 2f)
                lineTo(5f, 2f)
                curveTo(5.64f, 2.03f, 6.22f, 2.29f, 6.70f, 2.71f)
                lineTo(8f, 4f)
                lineTo(15f, 4f)
                lineTo(15f, 7f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(15f, 7f)
                    lineTo(14f, 7f)
                    lineTo(14f, 5f)
                    lineTo(10f, 5f)
                    lineTo(10f, 7f)
                    lineTo(7f, 7f)
                    lineTo(7f, 13f)
                    lineTo(1f, 13f)
                    lineTo(1f, 2f)
                    lineTo(5f, 2f)
                    curveTo(5.64f, 2.03f, 6.22f, 2.29f, 6.70f, 2.71f)
                    lineTo(8f, 4f)
                    lineTo(15f, 4f)
                    lineTo(15f, 7f)
                    close()
                }
            }
        }.build()

        return _Pplibfolder!!
    }

private var _Pplibfolder: ImageVector? = null

