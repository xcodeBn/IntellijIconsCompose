package github.xcodebn.intellijiconscompose.ide.shadow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bottomleft: ImageVector
    get() {
        if (_Bottomleft != null) return _Bottomleft!!

        _Bottomleft = ImageVector.Builder(
            name = "Bottomleft",
            defaultWidth = 18.0.dp,
            defaultHeight = 22.0.dp,
            viewportWidth = 18.0f,
            viewportHeight = 22.0f
        ).apply {

        }.build()

        return _Bottomleft!!
    }

private var _Bottomleft: ImageVector? = null

