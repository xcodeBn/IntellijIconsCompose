package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Junit: ImageVector
    get() {
        if (_Junit != null) return _Junit!!

        _Junit = ImageVector.Builder(
            name = "Junit",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(14f, 8f)
                lineTo(9f, 13f)
                lineTo(9f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(2f, 8f)
                lineTo(7f, 3f)
                lineTo(7f, 13f)
                close()
            }
        }.build()

        return _Junit!!
    }

private var _Junit: ImageVector? = null

