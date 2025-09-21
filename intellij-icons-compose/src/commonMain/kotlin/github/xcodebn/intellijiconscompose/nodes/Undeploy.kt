package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Undeploy: ImageVector
    get() {
        if (_Undeploy != null) return _Undeploy!!

        _Undeploy = ImageVector.Builder(
            name = "Undeploy",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(11f, 7f)
                lineTo(11f, 7f)
                lineTo(1f, 7f)
                lineTo(1f, 9f)
                lineTo(11f, 9f)
                lineTo(11f, 9f)
                lineTo(11f, 12f)
                lineTo(15f, 8f)
                lineTo(11f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(6f, 1f)
                lineTo(8f, 3f)
                lineTo(6f, 5f)
                lineTo(7f, 6f)
                lineTo(9f, 4f)
                lineTo(11f, 6f)
                lineTo(11f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(6f, 11f)
                lineTo(8f, 13f)
                lineTo(6f, 15f)
                lineTo(11f, 15f)
                lineTo(11f, 10f)
                lineTo(9f, 12f)
                lineTo(7f, 10f)
                close()
            }
        }.build()

        return _Undeploy!!
    }

private var _Undeploy: ImageVector? = null

